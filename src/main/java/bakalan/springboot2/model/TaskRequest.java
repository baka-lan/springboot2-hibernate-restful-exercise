package bakalan.springboot2.model;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class TaskRequest {
    @NotNull
    LocalDate startDate;
    @NotNull
    LocalDate endDate;
    long orderId;

    public TaskRequest() {
    }

    public TaskRequest(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TaskRequest(@NotNull LocalDate startDate, @NotNull LocalDate endDate, long orderId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderId = orderId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
