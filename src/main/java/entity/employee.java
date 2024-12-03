package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name= "employeeInfo")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String EmployeeName;
    private String email;
    private String employeeMoNumber;
    private String employeeAddress;
    private String dateOfJoining;


    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}
