import React, { Fragment } from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import { logout } from "../../redux/actions/auth";
import { logoutEmployee } from "../../redux/actions/employee";

const Navbar = ({
  auth: { isAuthenticated, loading },
  logout,
  employee: { employee },
  logoutEmployee,
}) => {
  const authLinks = (
    <ul>
      <li>
        <Link to="/dashboard">
          <i className="fas fa-user" />{" "}
          <span className="hide-sm">Dashboard</span>
        </Link>
      </li>
      <li>
        <a onClick={logout} href="/login">
          <i className="fas fa-sign-out-alt" />{" "}
          <span className="hide-sm">Logout</span>
        </a>
      </li>
    </ul>
  );

  const guestLinks = (
    <ul>
      <li>
        <Link to="/register">User Register</Link>
      </li>
      <li>
        <Link to="/login">User Login</Link>
      </li>
      <li>
        <Link to="/employee-login">Employee Login</Link>
      </li>
    </ul>
  );

  return (
    <nav className="navbar bg-dark">
      <h1>
        <Link to="/">
          <i className="fas fa-code" /> WDS
        </Link>
      </h1>
      {!loading && !employee && (
        <Fragment>{isAuthenticated ? authLinks : guestLinks}</Fragment>
      )}
      {employee ? (
        <ul>
          <li>
            <Link to="/employee-login" onClick={logoutEmployee}>
              Log Out
            </Link>
          </li>
        </ul>
      ) : null}
    </nav>
  );
};

const mapStateToProps = (state) => ({
  auth: state.auth,
  employee: state.employee,
});

export default connect(mapStateToProps, { logout, logoutEmployee })(Navbar);
