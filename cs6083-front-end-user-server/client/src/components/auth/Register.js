import React, { Fragment, useState } from "react";
import { Link, Redirect } from "react-router-dom";
import { connect } from "react-redux";

import { setAlert } from "../../redux/actions/alert";
import { registerUser } from "../../redux/actions/auth";

const Register = ({ setAlert, registerUser, isAuthenticated }) => {
  const [formData, setFormData] = useState({
    firstName: "",
    lastName: "",
    email: "",
    password: "",
    password2: "",
  });

  const { firstName, lastName, email, password, password2 } = formData;

  const onChange = (event) =>
    setFormData({ ...formData, [event.target.name]: event.target.value });

  const onSubmit = async (event) => {
    event.preventDefault();
    if (password !== password2) {
      setAlert("Passwords do not match", "danger");
    } else {
      registerUser({
        firstName,
        lastName,
        email,
        password,
      });
    }
  };

  // Redirect if logged in
  if (isAuthenticated) {
    return <Redirect to="/dashboard" />;
  }

  return (
    <Fragment>
      <h1 className="text-primary">Sign Up</h1>
      <p className="lead">
        <i className="fas fa-user"></i> Create Your Account
      </p>
      <form className="form" onSubmit={onSubmit}>
        <div className="form-group">
          <input
            type="text"
            placeholder="First Name"
            name="firstName"
            value={firstName}
            onChange={onChange}
            required
          />
        </div>
        <div className="form-group">
          <input
            type="text"
            placeholder="Last Name"
            name="lastName"
            value={lastName}
            onChange={onChange}
            required
          />
        </div>
        <div className="form-group">
          <input
            type="email"
            placeholder="Email Address"
            name="email"
            value={email}
            onChange={onChange}
          />
        </div>
        <div className="form-group">
          <input
            type="password"
            placeholder="Password"
            name="password"
            minLength="6"
            value={password}
            onChange={onChange}
          />
        </div>
        <div className="form-group">
          <input
            type="password"
            placeholder="Confirm Password"
            name="password2"
            minLength="6"
            value={password2}
            onChange={onChange}
          />
        </div>
        <input type="submit" className="btn btn-primary" value="Register" />
      </form>
      <p className="my-1">
        Already have an account? <Link to="/login">Login In</Link>
      </p>
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  isAuthenticated: state.auth.isAuthenticated,
});

export default connect(mapStateToProps, { setAlert, registerUser })(Register);
