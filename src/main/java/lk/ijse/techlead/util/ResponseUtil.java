package lk.ijse.techlead.util;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
