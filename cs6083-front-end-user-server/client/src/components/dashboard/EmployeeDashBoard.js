import React, { Fragment } from "react";
import { connect } from "react-redux";
import { Redirect } from "react-router-dom";
import ClientCard from "../employee/ClientCard";
import { getCustomerInfo } from "../../redux/actions/customer";

const EmployeeDashBoard = ({ employee: { employee }, getCustomerInfo }) => {
  if (!employee) {
    return <Redirect to="/employee-login" />;
  }

  const clickViewDetails = (event) => {
    getCustomerInfo(event.target.id);
  };
  return (
    <Fragment>
      <h3>Your Clients</h3>
      {employee.customers
        ? employee.customers.map((customer) => (
            <ClientCard
              key={customer.identifier}
              customer={customer}
              clickViewDetails={clickViewDetails}
            />
          ))
        : null}
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  employee: state.employee,
});

export default connect(mapStateToProps, {
  getCustomerInfo,
})(EmployeeDashBoard);
