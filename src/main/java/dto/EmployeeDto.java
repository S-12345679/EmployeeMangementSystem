package dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {
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
