package com.web.springmvc.web_tin_tuc.dto;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    @NotEmpty
    private String email;
    private String username;
    private String role;
    private String firstName;
    private String lastName;
    private String photoUrl = "/assets/images/customAvatar.jpg";
    private MultipartFile photo;
}
