import { GET_HOMEINVOICES } from "../types";
import axios from "axios";

export const getHomeInvoicesByPolicyNum = (policyNum) => async (dispatch) => {
  const res = await axios.get(
    `http://localhost:8080/api/homeinvoice/${policyNum}`
  );

  dispatch({
    type: GET_HOMEINVOICES,
    payload: res.data,
  });
};
