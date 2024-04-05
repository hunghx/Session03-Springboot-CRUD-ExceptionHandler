package ra.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor // constructor 0 tham so
@AllArgsConstructor // day du tham so
@Setter
@Getter
public class ProductRequest {
    private String productName;
    private Double price;
    private Integer stock;
    private String description;
    private MultipartFile file;
}
