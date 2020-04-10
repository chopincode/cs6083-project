import { GET_DRIVERS } from "../types";
import axios from "axios";

export const getDriversByAutoId = (autoId) => async (dispatch) => {
  const res = await axios.get(`http://localhost:8080/api/driver/${autoId}`);

  dispatch({
    type: GET_DRIVERS,
    payload: res.data,
  });
};
