import React, { Fragment, useState } from "react";
import { Link, Redirect } from "react-router-dom";
import { connect } from "react-redux";
import { loginUser } from "../../redux/actions/auth";

const Login = ({ isAuthenticated, loginUser }) => {
  const [formData, setFormData] = useState({
    email: "",
    password: "",
  });

  const { email, password } = formData;

  const onChange = (event) =>
    setFormData({ ...formData, [event.target.name]: event.target.value });

  const onSubmit = async (event) => {
    event.preventDefault();
    loginUser(email, password);
  };

  // Redirect if logged in
  if (isAuthenticated) {
    return <Redirect to="/dashboard" />;
  }
  return (
    <Fragment>
      <h1 className="text-primary">Sign In</h1>
      <p className="lead">
        <i className="fas fa-user"></i> Sign Into Your Account
      </p>
      <form className="form" onSubmit={onSubmit}>
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

        <input type="submit" className="btn btn-primary" value="Login" />
      </form>
      <p className="my-1">
        Don't have an account? <Link to="/register">Sign In</Link>
      </p>
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  isAuthenticated: state.auth.isAuthenticated,
});

export default connect(mapStateToProps, { loginUser })(Login);
