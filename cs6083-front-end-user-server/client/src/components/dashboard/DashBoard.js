import React, { useEffect, Fragment } from "react";
import { connect } from "react-redux";
import { getCurrentProfile } from "../../redux/actions/profile";
import Spinner from "../layout/Spinner";
import { Link } from "react-router-dom";
import DashBoardActions from "./DashBoardActions";

const DashBoard = ({
  getCurrentProfile,
  auth: { user },
  profile: { profile, loading },
}) => {
  useEffect(() => {
    async function fetchProfile() {
      return await getCurrentProfile();
    }
    fetchProfile();
  }, [getCurrentProfile]);
  return loading && profile === null ? (
    <Spinner />
  ) : (
    <Fragment>
      <h1 className="text-primary">DashBoard</h1>
      <p className="lead">
        <i className="fas fa-user">Welcome {user && user.firstName}</i>
      </p>
      {profile !== null ? (
        <Fragment>
          <DashBoardActions />
        </Fragment>
      ) : (
        <Fragment>
          <p>You have not yet setup a profile, please add some info</p>
          <Link to="/create-profile" className="btn btn-primary my-1">
            Create Profile
          </Link>
        </Fragment>
      )}
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  auth: state.auth,
  profile: state.profile,
});

export default connect(mapStateToProps, { getCurrentProfile })(DashBoard);
