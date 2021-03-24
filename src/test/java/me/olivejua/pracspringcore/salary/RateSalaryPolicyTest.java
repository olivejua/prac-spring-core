package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateSalaryPolicyTest {
    RateSalaryPolicy rateSalaryPolicy = new RateSalaryPolicy();

    @Test
    @DisplayName("인턴을 제외한 모든 직원은 연봉에 20%를 인상한다")
    void increase_o() {
        //given
        Employee employee = new Employee(1L, "employeeA", Position.STAFF, 30000000);

        //when
        int raisedAmount = rateSalaryPolicy.raisedAmount(employee);

        //then
        assertThat(raisedAmount).isEqualTo(6000000);
    }

    @Test
    @DisplayName("인턴은 연봉 인상이 적용되지 않아야 한다")
    void increase_x() {
        Employee employee = new Employee(1L, "employeeA", Position.INTERN, 30000000);

        int raisedAmount = rateSalaryPolicy.raisedAmount(employee);

        assertThat(raisedAmount).isEqualTo(0);
    }
}