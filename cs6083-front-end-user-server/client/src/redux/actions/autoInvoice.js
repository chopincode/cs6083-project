import { GET_AUTOINVOICES } from "../types";
import axios from "axios";

export const getAutoInvoicesByPolicyNum = (policyNum) => async (dispatch) => {
  const res = await axios.get(
    `http://localhost:8080/api/autoinvoice/${policyNum}`
  );

  dispatch({
    type: GET_AUTOINVOICES,
    payload: res.data,
  });
};
