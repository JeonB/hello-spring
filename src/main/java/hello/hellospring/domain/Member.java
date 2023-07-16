package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name = "member", schema = "tester")
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)//DB가 알아서 생성
    private Long id; //데이터 구분하기 위해서 쓰이는 고객이 아닌 시스템이 저장하는 ID.
    private String name; //고객이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
