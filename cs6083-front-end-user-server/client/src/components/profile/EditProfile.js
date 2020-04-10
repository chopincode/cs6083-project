import React, { useState, Fragment, useEffect } from "react";
import { connect } from "react-redux";
import { Link, withRouter } from "react-router-dom";
import { createProfile, getCurrentProfile } from "../../redux/actions/profile";

const EditProfile = ({
  profile: { profile, loading },
  createProfile,
  history,
  getCurrentProfile,
}) => {
  const [formData, setFormData] = useState({
    birthday: "",
    address: "",
  });

  useEffect(() => {
    async function fetchData() {
      await getCurrentProfile();
      setFormData({
        birthday: loading || !profile.birthday ? "" : profile.birthday,
        address: loading || !profile.address ? "" : profile.address,
      });
    }

    fetchData();
  }, [loading, getCurrentProfile, profile.birthday, profile.address]);

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
      <h1 className="large text-primary">Edit Your Profile</h1>
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

const mapStateToProps = (state) => ({
  profile: state.profile,
});

export default connect(mapStateToProps, { createProfile, getCurrentProfile })(
  withRouter(EditProfile)
);
