import React, { Fragment } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { getAutoByPolicyNumber } from "../../redux/actions/auto";
import { getAutoInvoicesByPolicyNum } from "../../redux/actions/autoInvoice";
import { getHomesByPolicyNumber } from "../../redux/actions/home";

const Policy = ({
  policyList,
  getAutoByPolicyNumber,
  getAutoInvoicesByPolicyNum,
  getHomesByPolicyNumber,
}) => {
  return (
    <Fragment>
      <Link to="/client-portal" className="btn btn-danger">
        Back To Your Client Portal
      </Link>
      {policyList
        ? policyList.map((policy) => {
            return (
              <ul className="list-group mt-4" key={policy.policyNum}>
                <li className="list-group-item list-group-item-danger">
                  Policy Number
                  {policy.insurType === "H" ? (
                    <Link
                      to="/homepolicy"
                      className="btn btn-primary ml-4"
                      onClick={(e) => {
                        getHomesByPolicyNumber(policy.policyNum);
                      }}
                    >
                      View Details
                    </Link>
                  ) : (
                    <Link
                      to="/autopolicy"
                      className="btn btn-primary ml-4"
                      onClick={(e) => {
                        getAutoByPolicyNumber(policy.policyNum);
                        getAutoInvoicesByPolicyNum(policy.policyNum);
                      }}
                    >
                      View Details
                    </Link>
                  )}
                </li>
                <li className="list-group-item">{policy.policyNum}</li>
                <li className="list-group-item list-group-item-secondary">
                  Policy Type
                </li>
                <li className="list-group-item">
                  {policy.insurType === "H" ? "Home" : "Auto"}
                </li>
                <li className="list-group-item list-group-item-secondary">
                  Premium Amount
                </li>
                <li className="list-group-item">${policy.premium}</li>
                <li className="list-group-item list-group-item-secondary">
                  Start Date
                </li>
                <li className="list-group-item">
                  {policy.startDate.slice(0, 10)}
                </li>
                <li className="list-group-item list-group-item-secondary">
                  Expiration Date
                </li>
                <li className="list-group-item">
                  {policy.endDate.slice(0, 10)}
                </li>
                <li className="list-group-item list-group-item-secondary">
                  Insurance Status
                </li>
                <li className="list-group-item">
                  {policy.curStatus === "C" ? "Current" : "Expired"}
                </li>
              </ul>
            );
          })
        : null}
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  policyList: state.customer.policyList,
});

export default connect(mapStateToProps, {
  getAutoByPolicyNumber,
  getAutoInvoicesByPolicyNum,
  getHomesByPolicyNumber,
})(Policy);
