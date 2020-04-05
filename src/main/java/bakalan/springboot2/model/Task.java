package bakalan.springboot2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "order_id")
    long orderId;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "time")
    LocalTime time;

    @Column(name = "resolved")
    boolean resolved;

    public Task() {
    }

    public Task(long orderId, LocalDate date, LocalTime time) {
        this.orderId = orderId;
        this.date = date;
        this.time = time;
        this.resolved = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}