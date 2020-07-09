package ru.itis.ivavprp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.ivavprp.dto.SkillDto;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "practice", name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int points;

    public static Skill fromSkillDto(SkillDto skillDto) {
        return Skill.builder()
                .id(skillDto.getId())
                .name(skillDto.getName())
                .points(skillDto.getPoints())
                .build();
    }

    public static SkillDto toSkillDto(Skill skill){
        return SkillDto.builder()
                .id(skill.getId())
                .name(skill.getName())
                .points(skill.getPoints())
                .build();
    }
}
