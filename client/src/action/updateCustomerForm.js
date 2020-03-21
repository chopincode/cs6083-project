import axios from "axios";
import { UPDATE_CUSTOMER_FORM } from "../types";

export const updateCustomerForm = requestBody => async dispatch => {
  axios
    .put(`http://localhost:8080/api/customer/${requestBody.id}`, requestBody)
    .then(res => console.log(res.data));
  dispatch({
    type: UPDATE_CUSTOMER_FORM,
    payload: { msg: "success" }
  });
};
