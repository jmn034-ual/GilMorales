import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-denunciar-comentario-comercial')
export class VistaDenunciarComentarioComercial extends LitElement {
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
<vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout1" style="align-items: center; width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-wrap: wrap; align-self: center;">
  <h1 id="denunciarL">Denunciar comentario</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; align-self: center; flex-shrink: 0; align-items: center; justify-content: flex-start; width: 60%;">
  <h4 id="h41" style="align-self: center;">Motivo:</h4>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 60%; flex-grow: 1;">
  <h4 id="h4" style="margin: 0px;">Explique los motivos de su denuncia:</h4>
  <vaadin-text-area id="motivoTA" style="flex-grow: 1; flex-shrink: 0; align-self: stretch;"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7" style="align-self: center; justify-content: center; flex-shrink: 0; padding: 1%;">
  <vaadin-button id="cancelarB" theme="primary error">
    Cancelar 
  </vaadin-button>
  <vaadin-button id="EnviarB" theme="primary success">
    Enviar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
