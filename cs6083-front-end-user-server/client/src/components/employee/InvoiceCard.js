import React, { Fragment } from "react";
import { connect } from "react-redux";

const InvoiceCard = ({ autoInvoices, homeInvoices }) => {
  return (
    <Fragment>
      {autoInvoices ? (
        <Fragment>
          {autoInvoices.map((invoice, index) => {
            return (
              <Fragment key={invoice.policyNum}>
                <li className="list-group-item list-group-item-danger mt-4">
                  Policy Index
                </li>
                <li className="list-group-item">{index}</li>
                <li className="list-group-item list-group-item-danger">
                  Policy Number
                </li>
                <li className="list-group-item">{invoice.policyNum}</li>
                <li className="list-group-item list-group-item-danger">
                  Invoice Payment Due Date
                </li>
                <li className="list-group-item">
                  {invoice.dueDate.slice(0, 10)}
                </li>
                <li className="list-group-item list-group-item-danger">
                  Amount To Pay
                </li>
                <li className="list-group-item">{invoice.amount}</li>
                <li className="list-group-item list-group-item-danger">
                  Payment Method
                </li>
                <li className="list-group-item">{invoice.paymentMethod}</li>
                <li className="list-group-item list-group-item-danger">
                  Payment Made On
                </li>
                <li className="list-group-item">
                  {invoice.paymentDate.slice(0, 10)}
                </li>
              </Fragment>
            );
          })}
        </Fragment>
      ) : null}
      {homeInvoices ? (
        <Fragment>
          {homeInvoices.map((invoice, index) => {
            return (
              <Fragment key={invoice.policyNum}>
                <li className="list-group-item list-group-item-danger mt-4">
                  Policy Index
                </li>
                <li className="list-group-item">{index}</li>
                <li className="list-group-item list-group-item-danger">
                  Policy Number
                </li>
                <li className="list-group-item">{invoice.policyNum}</li>
                <li className="list-group-item list-group-item-danger">
                  Invoice Payment Due Date
                </li>
                <li className="list-group-item">
                  {invoice.dueDate.slice(0, 10)}
                </li>
                <li className="list-group-item list-group-item-danger">
                  Amount To Pay
                </li>
                <li className="list-group-item">{invoice.amount}</li>
                <li className="list-group-item list-group-item-danger">
                  Payment Method
                </li>
                <li className="list-group-item">{invoice.paymentMethod}</li>
                <li className="list-group-item list-group-item-danger">
                  Payment Made On
                </li>
                <li className="list-group-item">
                  {invoice.paymentDate.slice(0, 10)}
                </li>
              </Fragment>
            );
          })}
        </Fragment>
      ) : null}
    </Fragment>
  );
};

const mapStateToProps = (state) => ({
  autoInvoices: state.autoInvoice,
  homeInvoices: state.homeInvoice,
});

export default connect(mapStateToProps)(InvoiceCard);
