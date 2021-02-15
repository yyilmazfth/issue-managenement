package indv.fth.springuyg.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", length = 400)
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    // STRING YADA ORDER SECILEBILIR. SECIME GORE DB UZERINDE TUTULAN DEGER ICERIGI NUMERİC YADA STRİNG OLACAKTIR.
    private IssueStatus issueStatus;

    @Column(name = "details", length = 4000)
    private String details;

    @JoinColumn(name = "assignee_user_id") // //ILISKISEL BIR PROPERTIE TUTULUYORSA @COLUMN KARSILIGIDIR.
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    // OPTİONAL ISNULLABLE SARTINI SAGLAR. FETCH İSE BU PROPERTIE HER ZAMAN DB DEN OKUNACAK MI DEMEKTIR
    //LAZY SADECE CAGIRILDIGINDA USER GETIRILECEK ANLAMINI TASIR
    //EAGER HER ZAMAN USER GETIRILECEK ANLAMINI TASIR
    private User assignee;

    @JoinColumn(name="project_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Project project;


}
