import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-denuncias')
export class VistaVerDenuncias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: 0px; padding: 0px; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
  <h1 id="denunciasL">Denuncias</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="align-self: flex-end; margin-right: var(--lumo-space-l);"></vaadin-horizontal-layout>
 <hr style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layoutListaDenuncias" style="flex-grow: 1; flex-shrink: 0; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; z-index: 99; margin: var(--lumo-space-s);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
