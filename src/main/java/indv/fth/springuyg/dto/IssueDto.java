package indv.fth.springuyg.dto;

import indv.fth.springuyg.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {
    private Long id;

    private String description;

    private Date date;

    private IssueStatus issueStatus;

    private UserDto assignee;

    private ProjectDto project;
}
