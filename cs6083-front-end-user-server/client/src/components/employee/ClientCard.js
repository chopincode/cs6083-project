import React from "react";
import { Link } from "react-router-dom";

const ClientCard = ({ customer, clickViewDetails }) => {
  return (
    <div className="card">
      <div className="card-body">
        <h4>
          {customer.firstName} {customer.lastName}
        </h4>
        <Link
          to="/client-portal"
          id={`${customer.id}`}
          onClick={clickViewDetails}
        >
          View Details
        </Link>
      </div>
    </div>
  );
};

export default ClientCard;
