import React, { useState, Fragment } from "react";
import { connect } from "react-redux";
import { Link, withRouter } from "react-router-dom";
import { createProfile } from "../../redux/actions/profile";

const CreateProfile = ({ createProfile, history }) => {
  const [formData, setFormData] = useState({
    birthday: "",
    address: "",
  });

  const handleChange = (event) => {
    const val = event.target.value;
    setFormData({ ...formData, [event.target.name]: val });
  };

  const onSubmit = (event) => {
    event.preventDefault();
    createProfile(formData, history);
  };

  return (
    <Fragment>
      <h1 className="large text-primary">Create Your Profile</h1>
      <p className="lead">
        <i className="fas fa-user"></i> Let's get some information to make your
        profile stand out
      </p>
      <small>* = required field</small>
      <form className="form" onSubmit={onSubmit}>
        <div className="form-group">
          <input
            type="text"
            placeholder="birthday"
            name="birthday"
            value={formData.birthday}
            onChange={handleChange}
          />
          <small className="form-text">
            Type your birthday in format of MM/DD/YYYY
          </small>
        </div>
        <div className="form-group">
          <input
            type="text"
            placeholder="address"
            name="address"
            value={formData.address}
            onChange={handleChange}
          />
        </div>

        <input type="submit" className="btn btn-primary my-1" />
        <Link className="btn btn-light my-1" to="/dashboard">
          Go Back
        </Link>
      </form>
    </Fragment>
  );
};

export default connect(null, { createProfile })(withRouter(CreateProfile));
