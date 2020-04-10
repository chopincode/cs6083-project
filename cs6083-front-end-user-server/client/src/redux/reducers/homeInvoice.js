import { GET_HOMEINVOICES } from "../types";

const initialState = [];

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_HOMEINVOICES:
      return [...payload];

    default:
      return state;
  }
}
