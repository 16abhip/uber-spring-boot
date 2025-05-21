package com.project.uber.uberApp.controllers;

import com.project.uber.uberApp.dto.*;
import com.project.uber.uberApp.services.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.Arrays;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    ResponseEntity<UserDto> signUp(@RequestBody SignUpDto signUpDto){
        return new ResponseEntity<>(authService.signup(signUpDto), HttpStatus.CREATED);
    }
    @Secured("ROLE_ADMIN")
    @PostMapping("/onboardNewDriver/{userId}")
    ResponseEntity<DriverDto> onboardNewDriver(@PathVariable Long userId, @RequestBody OnboardDriverDto onboardDriverDto){
        return new ResponseEntity<>(authService.onboardNewDriver(userId,
                onboardDriverDto.getVehicleId()), HttpStatus.CREATED);
    }
    @PostMapping("/login")
    ResponseEntity<LoginResDto> login(@RequestBody LoginReqDto loginReqDto, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String tokens[] = authService.login(loginReqDto.getEmail(), loginReqDto.getPassword());
        Cookie cookie = new Cookie("token", tokens[1]);
        cookie.setHttpOnly(true);
        httpServletResponse.addCookie(cookie);
        return ResponseEntity.ok(new LoginResDto(tokens[0]));
    }
    @PostMapping("/refresh")
    public ResponseEntity<LoginResDto> refresh(HttpServletRequest request){
        String refreshToken = Arrays.stream(request.getCookies())
                .filter(cookie -> "refreshToken".equals(cookie.getName()))
                .findFirst()
                .map(Cookie::getValue)
                .orElseThrow(() -> new AuthenticationServiceException("Refresh Token not found inside the Cookies"));
        String accessToken = authService.refreshToken(refreshToken);
        return ResponseEntity.ok(new LoginResDto(accessToken));
    }
}
