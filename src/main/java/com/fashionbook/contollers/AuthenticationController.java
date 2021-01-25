package com.fashionbook.contollers;


import com.fashionbook.config.jwt.JwtUtil;
import com.fashionbook.entities.security.AuthenticationRequest;
import com.fashionbook.entities.security.AuthenticationResponse;
import com.fashionbook.service.myinterfaces.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

//    TODO You must refactor the code to imlement a correct responseEntity on react , and manage failed login
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationController(@RequestBody AuthenticationRequest authenticationRequest)
            throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authenticationRequest.getUsername(),
                            authenticationRequest.getPassword()));

        }catch (BadCredentialsException e){
                throw new Exception("Incorrect username or password");
        }
        final UserDetails USERDETAILS = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String JWT = jwtTokenUtil.generateToken(USERDETAILS);

        return ResponseEntity.ok(new AuthenticationResponse(JWT));
    }

}
