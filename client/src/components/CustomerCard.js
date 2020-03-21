import React, { Fragment } from "react";

const CustomerCard = ({ customer }) => {
  return (
    <Fragment>
      <h3>
        {customer.firstName} {customer.lastName}
      </h3>
    </Fragment>
  );
};

export default CustomerCard;
