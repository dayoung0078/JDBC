package com.ohgiraffers.employee.dto;

public class EmpInsertDTO {

    private String empName;

    private String empId;

    private String empNo;

    public EmpInsertDTO() {

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    private String jobCode;

    private String salLevel;


    public EmpInsertDTO(String empName, String empId, String empNo, String jobCode, String salLevel) {
        this.empName = empName;
        this.empId = empId;
        this.empNo = empNo;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
    }

    @Override
    public String toString() {
        return "EmpInsertDTO{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", empNo='" + empNo + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                '}';
    }
}
