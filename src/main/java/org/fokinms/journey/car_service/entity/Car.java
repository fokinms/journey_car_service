package org.fokinms.journey.car_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_name", length = 64, nullable = false)
    private String carName;

    @Column(name = "city", length = 64, nullable = false)
    private String city;

    @Column(name = "car_class", length = 16, nullable = false)
    @Enumerated(EnumType.STRING)
    private CarClass carClass;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "car_status", length = 16, nullable = false)
    @Enumerated(EnumType.STRING)
    private CarStatus carStatus;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void setCarStatus() {
        if (carStatus == null) {
            carStatus = CarStatus.FREE;
        }
    }
}
