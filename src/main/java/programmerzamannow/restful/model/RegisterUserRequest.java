package programmerzamannow.restful.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterUserRequest {

    @NotBlank
    @Size(max = 100)
    private String username;

    @NotBlank
    @Size(max = 100)
    private String password;

    @NotBlank
    @Size(max = 100)
    private String name;

    public RegisterUserRequest(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public RegisterUserRequest() {
    }

    public @NotBlank @Size(max = 100) String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank @Size(max = 100) String username) {
        this.username = username;
    }

    public @NotBlank @Size(max = 100) String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank @Size(max = 100) String password) {
        this.password = password;
    }

    public @NotBlank @Size(max = 100) String getName() {
        return name;
    }

    public void setName(@NotBlank @Size(max = 100) String name) {
        this.name = name;
    }
}
