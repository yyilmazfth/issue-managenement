package indv.fth.springuyg.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "issue_history")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(name = "issue_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Issue issue;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

    @Column(name="details",length = 4000)
    private String details;


    @Column(name="description",length = 4000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date",length = 4000)
    private Date date;
}
