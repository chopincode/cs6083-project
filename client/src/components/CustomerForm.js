import React, { useState } from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import { updateCustomerForm } from "../action/updateCustomerForm";

const CustomerForm = ({ customerFormData }) => {
  const [formData, setFormData] = useState({
    firstName: "",
    lastName: "",
    address: "",
    gender: "",
    maritalStatus: ""
  });

  const onChange = event => {
    const val = event.target.value;
    setFormData({ ...formData, [event.target.name]: val });
    console.log(formData);
  };
  const onSubmit = event => {
    const requestBody = { id: customerFormData.id, ...formData };
    updateCustomerForm(requestBody);
  };
  return (
    <form className="text-left">
      <div className="form-group">
        <label htmlFor="id">ID</label>
        <input
          type="number"
          className="form-control"
          name="id"
          disabled
          value={formData.id}
          placeholder={customerFormData.id}
        />
      </div>
      <div className="form-group">
        <label htmlFor="firstName">First Name</label>
        <input
          type="text"
          className="form-control"
          name="firstName"
          value={formData.firstName}
          onChange={onChange}
          placeholder={customerFormData.firstName}
        />
      </div>
      <div className="form-group">
        <label htmlFor="lastName">Last Name</label>
        <input
          type="text"
          className="form-control"
          name="lastName"
          value={formData.lastName}
          onChange={onChange}
          placeholder={customerFormData.lastName}
        />
      </div>
      <div className="form-group">
        <label htmlFor="address">Address</label>
        <input
          type="text"
          className="form-control"
          name="address"
          value={formData.address}
          onChange={onChange}
          placeholder={customerFormData.address}
        />
      </div>
      <div className="form-group">
        <label htmlFor="gender">Gender</label>
        <input
          type="text"
          className="form-control"
          name="gender"
          value={formData.gender}
          onChange={onChange}
          placeholder={customerFormData.gender}
        />
      </div>
      <div className="form-group">
        <label htmlFor="maritalStatus">Marital Status</label>
        <input
          type="text"
          className="form-control"
          name="maritalStatus"
          value={formData.marital_status}
          onChange={onChange}
          placeholder={customerFormData.marital_status}
        />
      </div>
      <input
        type="submit"
        className="btn btn-success btn-md"
        onSubmit={onSubmit}
      />
      <Link to="/" className="btn btn-danger btn-md">
        Cancel
      </Link>
    </form>
  );
};

const mapStateToProps = state => ({
  customerFormData: state.customerInfo
});

export default connect(mapStateToProps, { updateCustomerForm })(CustomerForm);
