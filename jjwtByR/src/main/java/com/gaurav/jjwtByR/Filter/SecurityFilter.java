package com.gaurav.jjwtByR.Filter;

import com.gaurav.jjwtByR.Util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SecurityFilter  extends OncePerRequestFilter {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {



        //1.read token from auth head
        String tokenAuth = request.getHeader("Authorization");

        if (tokenAuth != null){
            //do validation
            String username = jwtUtil.getUsername(tokenAuth);
            //usernam should not be empty ,context-auth must be empty
            if (username !=null && SecurityContextHolder.getContext().getAuthentication()==null){

                UserDetails usr = userDetailsService.loadUserByUsername(username);

                //vallidate token  database username validate
                boolean isvalidateToken = jwtUtil.validateToken(tokenAuth, usr.getUsername());

                if (isvalidateToken){
                    UsernamePasswordAuthenticationToken authToken =
                            new UsernamePasswordAuthenticationToken(username,usr.getPassword());

                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    //final object stored in security context with USERDETAILS((((username and password
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                }

            }
        }
        filterChain.doFilter(request,response);


    }
    //define one filter which gets executed for every requst.

    //if request is having authorization header,then validate using jwtutil

    //if valid then create authentication inside securitycontext\

    // user onceperRequesttFilter override method dofilterInternal() method



}

