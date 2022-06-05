package com.hamitmizrak.project2;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "teacher")
public class _1_TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id",updatable = false)
    private Long teacherId;

    @Column(name = "teacher_name")
    @NotEmpty(message = "lütfen adı alanını boş bırakmayınız")
    @Size(min=1,max=255)
    private String teacherName;

    @Column(name = "teacher_surname")
    @NotEmpty(message = "lütfen adı alanını boş bırakmayınız")
    private String teacherSurname;


    @Column(name = "created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;




//    private Long teacherId;
//    private String teacherName;
//    private String teacherSurname;
}
