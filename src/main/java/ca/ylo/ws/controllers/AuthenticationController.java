package ca.ylo.ws.controllers;

import ca.ylo.ws.model.OtpEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthenticationController {

    private static final String PHONE_NUMBER_PATTERN = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    @GetMapping("/otp")
    public ResponseEntity<OtpEvent> requestOtp(@RequestParam("phoneNumber") String phoneNumber) {
        OtpEvent otpEvent = new OtpEvent()
                .setOtpEventId(UUID.randomUUID().toString())
                .setRequestedAt(new Date())
                .setPhoneNumber(phoneNumber)
                .setExpiresAt(
                        Date.from(
                            LocalDateTime
                                    .now()
                                    .plus(5, ChronoUnit.MINUTES).
                                    atZone(ZoneId.systemDefault()).toInstant()
                        )
                ) //TODO make this configurable
                .setOtpValue(RandomStringUtils.randomNumeric(4));
        log.info("Created OTP - "+otpEvent.toString());


        return ResponseEntity.ok(otpEvent);
    }



}
