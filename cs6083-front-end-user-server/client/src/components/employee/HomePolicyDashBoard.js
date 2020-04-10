import React, { Fragment } from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import InvoiceCard from "./InvoiceCard";
import { v4 as uuidv4 } from "uuid";
const HomePolicyDashBoard = ({ homes }) => {
  const map = new Map();
  map.set("U", "Underground");
  map.set("O", "Overground");
  map.set("I", "Indoor");
  map.set("M", "Multiple");
  return (
    <Fragment>
      <Link to="/policy" className="btn btn-danger mb-2">
        Back To Policy DashBoard
      </Link>
      <div className="row">
        <div className="col-6">
          <div className="h5 list-group-item list-group-item-primary text-center">
            List of Home Properties on This Policy
          </div>
          {homes.map((home) => {
            return (
              <Fragment key={uuidv4()}>
                <div className="list-group-item list-group-item-success mt-4">
                  Purchase Date
                </div>
                <div className="list-group-item">
                  {home.purchaseDate.slice(0, 10)}
                </div>
                <div className="list-group-item list-group-item-success">
                  Purchase Value
                </div>
                <div className="list-group-item">${home.purchaseValue}</div>
                <div className="list-group-item list-group-item-success">
                  Home Area (in Square Feet)
                </div>
                <div className="list-group-item">{home.homeArea}</div>
                <div className="list-group-item list-group-item-success">
                  Auto Fire Alarm System
                </div>
                <div className="list-group-item">
                  {home.autoFire === 1 ? "Installed" : "Not Installed"}
                </div>
                <div className="list-group-item list-group-item-success">
                  Home Security System
                </div>
                <div className="list-group-item">
                  {home.homeSecurity === 1 ? "Installed" : "Not Installed"}
                </div>
                <div className="list-group-item list-group-item-success">
                  Pool
                </div>
                <div className="list-group-item">{map.get(home.pool)}</div>
                <div className="list-group-item list-group-item-success">
                  Basement
                </div>
                <div className="list-group-item">
                  {home.basement === "1" ? "YES" : "NO"}
                </div>
              </Fragment>
            );
          })}
        </div>

        <div className="col-6 align-items-end">
          <ul className="list-group">
            <li className="list-group-item list-group-item-warning h5 text-center">
              All Invoices
            </li>
            <InvoiceCard />
          </ul>
        </div>
      </div>
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  homes: state.home,
});

export default connect(mapStateToProps)(HomePolicyDashBoard);
