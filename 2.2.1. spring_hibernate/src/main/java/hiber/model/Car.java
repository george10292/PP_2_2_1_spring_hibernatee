package hiber.model;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    @NonNull
    private String model;
    @Column(name = "series")
    @NonNull
    private int series;
    @OneToOne(mappedBy = "car")
    private User user;
}
