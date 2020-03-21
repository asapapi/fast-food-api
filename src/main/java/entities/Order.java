package entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss")
    private LocalDate createdAt;
    private Status status;
    private String description;
    private String note;
    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss")
    private LocalDate lastUpdated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", note='" + note + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(customerName, order.customerName) &&
                Objects.equals(createdAt, order.createdAt) &&
                status == order.status &&
                Objects.equals(description, order.description) &&
                Objects.equals(note, order.note) &&
                Objects.equals(lastUpdated, order.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, createdAt, status, description, note, lastUpdated);
    }
}
