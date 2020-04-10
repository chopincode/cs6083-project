import { GET_AUTOINVOICES } from "../types";

const initialState = [];

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_AUTOINVOICES:
      return [...payload];

    default:
      return state;
  }
}
