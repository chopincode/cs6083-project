import React, { Fragment } from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import { clearCustomerInfo } from "../../redux/actions/customer";

const CustomerPortal = ({ clearCustomerInfo, customer }) => {
  return (
    <Fragment>
      <Link
        to="/employee-dashboard"
        className="btn btn-primary"
        onClick={(e) => clearCustomerInfo()}
      >
        Go Back
      </Link>
      <ul className="list-group mt-4">
        <li className="list-group-item list-group-item-info">First Name</li>
        <li className="list-group-item">{customer.firstName}</li>
        <li className="list-group-item list-group-item-info">Last Name</li>
        <li className="list-group-item">{customer.lastName}</li>
        <li className="list-group-item list-group-item-info">Address</li>
        <li className="list-group-item">{customer.lastName}</li>
        <li className="list-group-item list-group-item-info">Gender</li>
        {customer.gender !== null && customer.gender === "M" ? (
          <li className="list-group-item">Male</li>
        ) : null}
        {customer.gender !== null && customer.gender === "F" ? (
          <li className="list-group-item">Female</li>
        ) : null}
        <li className="list-group-item list-group-item-info">Marital Status</li>
        {customer.maritalStatus === "M" ? (
          <li className="list-group-item">Married</li>
        ) : (
          <li className="list-group-item">Single</li>
        )}
        <li className="list-group-item list-group-item-info">Policy</li>
        {customer.policyList ? (
          <li className="list-group-item">
            Active Policies On File: {customer.policyList.length}
            <Link to="/policy" className="btn btn-primary ml-3">
              View Details
            </Link>
          </li>
        ) : null}
      </ul>
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  customer: state.customer,
});

export default connect(mapStateToProps, { clearCustomerInfo })(CustomerPortal);
