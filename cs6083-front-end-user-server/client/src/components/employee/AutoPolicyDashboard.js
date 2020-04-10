import React, { Fragment, useState } from "react";
import { connect } from "react-redux";
import { getDriversByAutoId } from "../../redux/actions/driver";
import { v4 as uuidv4 } from "uuid";
import { Link } from "react-router-dom";
import InvoiceCard from "./InvoiceCard";

const AutoPolicyDashboard = ({ autos, getDriversByAutoId, drivers }) => {
  const map = new Map();
  map.set("O", "Owned");
  map.set("L", "Lease");
  map.set("F", "Finance");

  const [iconClass, setIconClass] = useState({
    currentClass: "fas fa-arrow-circle-down",
    nextClass: "fas fa-arrow-circle-up",
    currentDisplay: "none",
    nextDisplay: "block",
  });

  return (
    <Fragment>
      <Link to="/policy" className="btn btn-danger mb-2">
        Back To Policy DashBoard
      </Link>
      <div className="row">
        <div className="col-6">
          <div className="h5 list-group-item list-group-item-primary text-center">
            List of Automobiles on This Policy
          </div>
          {autos.map((auto) => {
            return (
              <Fragment key={auto.vin}>
                <div className="list-group-item list-group-item-success mt-3">
                  Automobile VIN number
                </div>
                <div className="list-group-item">{auto.vin}</div>
                <div className="list-group-item list-group-item-success">
                  Make
                </div>
                <div className="list-group-item">{`${(
                  auto.make + ""
                ).toUpperCase()}`}</div>
                <div className="list-group-item list-group-item-success">
                  Model
                </div>
                <div className="list-group-item">{auto.model}</div>
                <div className="list-group-item list-group-item-success">
                  Year
                </div>
                <div className="list-group-item">{auto.year}</div>
                <div className="list-group-item list-group-item-success">
                  Financing Status
                </div>
                <div className="list-group-item">
                  {map.get(auto.autoStatus)}
                </div>

                <div
                  className="list-group-item list-group-item-warning mt-4 text-center"
                  onClick={(e) => {
                    getDriversByAutoId(auto.autoId);
                    setIconClass({
                      currentClass: iconClass.nextClass,
                      nextClass: iconClass.currentClass,
                      currentDisplay: iconClass.nextDisplay,
                      nextDisplay: iconClass.currentDisplay,
                    });
                  }}
                >
                  View All Registered Drivers On This Vehicle{" "}
                  <i className={iconClass.currentClass}></i>
                </div>
                {drivers
                  ? drivers.map((driver) => {
                      return (
                        <Fragment key={uuidv4()}>
                          <ul
                            className="list-group mt-3"
                            style={{ display: iconClass.currentDisplay }}
                          >
                            <li className="list-group-item list-group-item-danger">
                              Driver Full Name
                            </li>
                            <li className="list-group-item">
                              {driver.firstName} {driver.lastName}
                            </li>
                            <li className="list-group-item list-group-item-danger">
                              License Number
                            </li>
                            <li className="list-group-item">
                              {driver.licenseNumber}
                            </li>
                            <li className="list-group-item list-group-item-danger">
                              Birth Date
                            </li>
                            <li className="list-group-item">
                              {driver.birthday.slice(0, 10)}
                            </li>
                          </ul>
                        </Fragment>
                      );
                    })
                  : null}
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
  autos: state.auto,
  drivers: state.driver,
});

export default connect(mapStateToProps, { getDriversByAutoId })(
  AutoPolicyDashboard
);
