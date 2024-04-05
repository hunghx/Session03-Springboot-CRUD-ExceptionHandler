package ra.example.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor // constructor 0 tham so
@AllArgsConstructor // day du tham so
@Setter
@Getter
@Entity // Chi dinh Lop anh xa voi 1 Table trong CSDL
//@Table(name = "")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong sinh gia tri
    private Long productId;
    private String productName;
    private Double price;
    private Integer stock;
    private String description;
    private String imageUrl;
    private Date createdDate;
    private Boolean status;
}
