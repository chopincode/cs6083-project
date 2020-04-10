import React, { useState, Fragment } from "react";
import { connect } from "react-redux";
import { loginEmployee } from "../../redux/actions/employee";
import { Redirect } from "react-router-dom";

const EmployeeLogin = ({ loginEmployee, employee: { employee } }) => {
  const [formData, setFormData] = useState({
    corporateId: "",
    password: "",
  });
  const onChange = (event) => {
    const val = event.target.value;
    setFormData({ ...formData, [event.target.name]: val });
  };
  const onSubmit = (event) => {
    event.preventDefault();
    loginEmployee(formData);
  };

  if (employee) {
    return <Redirect to="/employee-dashboard" />;
  }
  return (
    <Fragment>
      <h1 className="text-primary">Employee Sign In</h1>
      <p className="lead">
        <i className="fas fa-user"></i> Sign Into Your Account
      </p>
      <form className="form" onSubmit={onSubmit}>
        <div className="form-group">
          <input
            type="text"
            placeholder="Coporate ID"
            name="corporateId"
            value={formData.corporateId}
            onChange={onChange}
          />
        </div>
        <div className="form-group">
          <input
            type="password"
            placeholder="Password"
            name="password"
            minLength="6"
            value={formData.password}
            onChange={onChange}
          />
        </div>

        <input type="submit" className="btn btn-primary" value="Login" />
      </form>
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  employee: state.employee,
});

export default connect(mapStateToProps, { loginEmployee })(EmployeeLogin);
