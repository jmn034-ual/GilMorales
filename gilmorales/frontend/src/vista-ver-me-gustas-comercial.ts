import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-me-gustas-comercial')
export class VistaVerMeGustasComercial extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; height: 80%; width: 50%; flex-wrap: wrap; flex-direction: row; align-content: flex-start; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; flex-wrap: wrap;">
   <h1 id="meGustasL">Me gustas</h1>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
