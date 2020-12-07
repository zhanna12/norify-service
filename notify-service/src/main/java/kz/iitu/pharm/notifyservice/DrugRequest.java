package kz.iitu.pharm.notifyservice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugRequest {
    private Long userId;
    private Drug drug;

    public Long getUserId() {
        return userId;
    }

    public Drug getDrug() {
        return drug;
    }
}
