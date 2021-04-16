package mocarim.mocarim.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    private String userId;

    @Column
    private String nickname;

    @Column
    private String address;

    @Column
    private int age;

    @Column
    private String gender;

    @Column
    private String useYn;

    @Column
    private String creater;

    @Column
    private LocalDateTime creationDate;

    @Column
    private String modifier;

    @Column
    private LocalDateTime modifyDate;

    @Builder
    public User(String userId, String nickname, String address, int age, String gender, String useYn, String creater, String modifier) {
        this.userId = userId;
        this.nickname = nickname;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.useYn = useYn;
        this.creater = creater;
        this.modifier = modifier;
    }

    @PrePersist
    public void insertTime(){
        this.creationDate = LocalDateTime.now();
        this.modifyDate = LocalDateTime.now();
    }

}
