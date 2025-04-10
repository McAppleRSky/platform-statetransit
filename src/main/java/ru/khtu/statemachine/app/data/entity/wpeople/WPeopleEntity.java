package ru.khtu.statemachine.app.data.entity.wpeople;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter
@EqualsAndHashCode
@Entity
@Table(name="w_wpeople")
public class WPeopleEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "spec_id")
    public Long specId;

    @Column(name="wFirstNameTX", length=150, nullable=false)
    private String wFirstNameTX;

    @Column(name="wFamilyNameTX", length=150, nullable=false)
    private String wFamilyNameTX;

    @Column(name="wSurnameTX", length=150, nullable=false)
    private String wSurnameTX;

    @Column(name="wRecordStateSY", length=100, nullable=false)
    private String wRecordStateSY;

    @Column(name="wPreviousStateSY", length=100, nullable=false)
    private String wPreviousStateSY;

    @Column(name="wStatusCL", length=150, nullable=false)
    private String wStatusCL;

    @Column(name="wPreviousStatusCL", length=150, nullable=false)
    private String wPreviousStatusCL;

}
