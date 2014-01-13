/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author junxin
 */
@Entity
@Table(name = "PERSONNEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personnel.findAll", query = "SELECT p FROM Personnel p"),
    @NamedQuery(name = "Personnel.findByUserId", query = "SELECT p FROM Personnel p WHERE p.userId = :userId"),
    @NamedQuery(name = "Personnel.findByUsername", query = "SELECT p FROM Personnel p WHERE p.username = :username"),
    @NamedQuery(name = "Personnel.findByPassword", query = "SELECT p FROM Personnel p WHERE p.password = :password"),
    @NamedQuery(name = "Personnel.findByAdmin", query = "SELECT p FROM Personnel p WHERE p.admin = :admin"),
    @NamedQuery(name = "Personnel.findByLastName", query = "SELECT p FROM Personnel p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Personnel.findByFirstName", query = "SELECT p FROM Personnel p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Personnel.findByMiddleName", query = "SELECT p FROM Personnel p WHERE p.middleName = :middleName"),
    @NamedQuery(name = "Personnel.findBySsn", query = "SELECT p FROM Personnel p WHERE p.ssn = :ssn"),
    @NamedQuery(name = "Personnel.findByBirthDate", query = "SELECT p FROM Personnel p WHERE p.birthDate = :birthDate"),
    @NamedQuery(name = "Personnel.findByServiceDate", query = "SELECT p FROM Personnel p WHERE p.serviceDate = :serviceDate"),
    @NamedQuery(name = "Personnel.findByStreet", query = "SELECT p FROM Personnel p WHERE p.street = :street"),
    @NamedQuery(name = "Personnel.findByCity", query = "SELECT p FROM Personnel p WHERE p.city = :city"),
    @NamedQuery(name = "Personnel.findByStates", query = "SELECT p FROM Personnel p WHERE p.states = :states"),
    @NamedQuery(name = "Personnel.findByPostalCode", query = "SELECT p FROM Personnel p WHERE p.postalCode = :postalCode"),
    @NamedQuery(name = "Personnel.findByMobilePhone", query = "SELECT p FROM Personnel p WHERE p.mobilePhone = :mobilePhone"),
    @NamedQuery(name = "Personnel.findByOfficePhone", query = "SELECT p FROM Personnel p WHERE p.officePhone = :officePhone"),
    @NamedQuery(name = "Personnel.findByHomePhone", query = "SELECT p FROM Personnel p WHERE p.homePhone = :homePhone"),
    @NamedQuery(name = "Personnel.findByEName", query = "SELECT p FROM Personnel p WHERE p.eName = :eName"),
    @NamedQuery(name = "Personnel.findByRelationship", query = "SELECT p FROM Personnel p WHERE p.relationship = :relationship"),
    @NamedQuery(name = "Personnel.findByEPhone", query = "SELECT p FROM Personnel p WHERE p.ePhone = :ePhone"),
    @NamedQuery(name = "Personnel.findByEStreet", query = "SELECT p FROM Personnel p WHERE p.eStreet = :eStreet"),
    @NamedQuery(name = "Personnel.findByECity", query = "SELECT p FROM Personnel p WHERE p.eCity = :eCity"),
    @NamedQuery(name = "Personnel.findByEStates", query = "SELECT p FROM Personnel p WHERE p.eStates = :eStates"),
    @NamedQuery(name = "Personnel.findByEPostalCode", query = "SELECT p FROM Personnel p WHERE p.ePostalCode = :ePostalCode"),
    @NamedQuery(name = "Personnel.findByNumberYearsExperience", query = "SELECT p FROM Personnel p WHERE p.numberYearsExperience = :numberYearsExperience"),
    @NamedQuery(name = "Personnel.findByTrainingCertificateName", query = "SELECT p FROM Personnel p WHERE p.trainingCertificateName = :trainingCertificateName"),
    @NamedQuery(name = "Personnel.findByCertificateDate", query = "SELECT p FROM Personnel p WHERE p.certificateDate = :certificateDate")})
public class Personnel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADMIN")
    private Short admin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 255)
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "SSN")
    private String ssn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "SERVICE_DATE")
    @Temporal(TemporalType.DATE)
    private Date serviceDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "STREET")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "STATES")
    private String states;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "OFFICE_PHONE")
    private String officePhone;
    @Size(max = 16)
    @Column(name = "HOME_PHONE")
    private String homePhone;
    @Size(max = 255)
    @Column(name = "E_NAME")
    private String eName;
    @Size(max = 16)
    @Column(name = "RELATIONSHIP")
    private String relationship;
    @Size(max = 16)
    @Column(name = "E_PHONE")
    private String ePhone;
    @Size(max = 255)
    @Column(name = "E_STREET")
    private String eStreet;
    @Size(max = 255)
    @Column(name = "E_CITY")
    private String eCity;
    @Size(max = 2)
    @Column(name = "E_STATES")
    private String eStates;
    @Size(max = 5)
    @Column(name = "E_POSTAL_CODE")
    private String ePostalCode;
    @Column(name = "NUMBER_YEARS_EXPERIENCE")
    private Integer numberYearsExperience;
    @Size(max = 255)
    @Column(name = "TRAINING_CERTIFICATE_NAME")
    private String trainingCertificateName;
    @Column(name = "CERTIFICATE_DATE")
    @Temporal(TemporalType.DATE)
    private Date certificateDate;
    @JoinColumn(name = "SKILL", referencedColumnName = "SKILL")
    @ManyToOne
    private Skill skill;
    @JoinColumn(name = "USER_ROLE", referencedColumnName = "USER_ROLE")
    @ManyToOne(optional = false)
    private UserRole userRole;
    @JoinColumn(name = "GENDER", referencedColumnName = "GENDER")
    @ManyToOne(optional = false)
    private Gender gender;

    public Personnel() {
    }

    public Personnel(String userId) {
        this.userId = userId;
    }

    public Personnel(String userId, String username, String password, String lastName, String firstName, String ssn, Date birthDate, String street, String city, String states, String postalCode, String mobilePhone, String officePhone) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.street = street;
        this.city = city;
        this.states = states;
        this.postalCode = postalCode;
        this.mobilePhone = mobilePhone;
        this.officePhone = officePhone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getAdmin() {
        return admin;
    }

    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEPhone() {
        return ePhone;
    }

    public void setEPhone(String ePhone) {
        this.ePhone = ePhone;
    }

    public String getEStreet() {
        return eStreet;
    }

    public void setEStreet(String eStreet) {
        this.eStreet = eStreet;
    }

    public String getECity() {
        return eCity;
    }

    public void setECity(String eCity) {
        this.eCity = eCity;
    }

    public String getEStates() {
        return eStates;
    }

    public void setEStates(String eStates) {
        this.eStates = eStates;
    }

    public String getEPostalCode() {
        return ePostalCode;
    }

    public void setEPostalCode(String ePostalCode) {
        this.ePostalCode = ePostalCode;
    }

    public Integer getNumberYearsExperience() {
        return numberYearsExperience;
    }

    public void setNumberYearsExperience(Integer numberYearsExperience) {
        this.numberYearsExperience = numberYearsExperience;
    }

    public String getTrainingCertificateName() {
        return trainingCertificateName;
    }

    public void setTrainingCertificateName(String trainingCertificateName) {
        this.trainingCertificateName = trainingCertificateName;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personnel)) {
            return false;
        }
        Personnel other = (Personnel) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Personnel[ userId=" + userId + " ]";
    }
    
}
